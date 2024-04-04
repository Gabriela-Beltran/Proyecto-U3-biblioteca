from reportlab.lib.pagesizes import letter
from reportlab.lib import colors
from reportlab.platypus import SimpleDocTemplate, Table, TableStyle, Spacer, Paragraph, Image
from reportlab.lib.styles import getSampleStyleSheet
import base64
import io


class PDFCreator:
    def __init__(self, filename):
        self.filename = filename
        self.data = []
        
    
    def agregar_encabezados(self, encabezados):
        self.data.append(encabezados)
    
    def agregar_fila(self, fila):
        self.data.append(fila)

    def generar_pdf(self,titulo,params):
        pdf = SimpleDocTemplate(self.filename, pagesize=letter)
        styles = getSampleStyleSheet()
        estilo_encabezado = styles['Heading1']
        #centrar
        estilo_encabezado.alignment = 1

        tabla = Table(self.data)
        # Cando exceda el tamaño de la página, se ajustará automáticamente

        estilo_tabla = TableStyle([
            ('BACKGROUND', (0, 0), (-1, 0), colors.grey),
            ('TEXTCOLOR', (0, 0), (-1, 0), colors.whitesmoke),
            ('ALIGN', (0, 0), (-1, -1), 'CENTER'),
            ('FONTNAME', (0, 0), (-1, 0), 'Helvetica-Bold'),
            ('FONTSIZE', (0, 0), (-1, 0), 12),
            ('BOTTOMPADDING', (0, 0), (-1, 0), 12),
            ('BACKGROUND', (0, 1), (-1, -1), colors.beige),
            ('TEXTCOLOR', (0, 1), (-1, -1), colors.black),
            ('FONTSIZE', (0, 1), (-1, -1), 10),
            ('TOPPADDING', (0, 1), (-1, -1), 4),
            ('BOTTOMPADDING', (0, -1), (-1, -1), 12),
        ])
        tabla.setStyle(estilo_tabla)
        contenido = []

         # Agregar el título del informe
        titulo = Paragraph(titulo, estilo_encabezado)
        contenido.append(titulo)

        # Agregar un subtítulo
        subtitle = Paragraph(params, estilo_encabezado)
        contenido.append(subtitle)

        # Agregar una imagen
        #imagen_path = "src/logo.png"
        #imagen = Image(imagen_path, width=200, height=200)
        #contenido.append(imagen)
        contenido.append(Spacer(1, 20))
        contenido.append(tabla)

        pdf.build(contenido)
        print(f"Se ha creado el archivo PDF: {self.filename}")
    
    def toBase64(self):
        with open(self.filename, "rb") as archivo:
             pdf_content = archivo.read()
             pdf_content_base64 = base64.b64encode(pdf_content).decode('utf-8')

        return pdf_content_base64