
package com.ServicioMock;


public class EvaluationResult {
    private int rating;
    private String review;

    public EvaluationResult(int rating, String review) {
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
