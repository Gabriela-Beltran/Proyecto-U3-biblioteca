
package com.ServicioMock;


public class ResultadoDeEvaluacion {
    private int rating;
    private String review;

    public ResultadoDeEvaluacion(int rating, String review) {
        this.rating = rating;
        this.review = review;
    }

    public int getRating() {
        return rating;
    }

    public String getReview() {
        return review;
    }
}