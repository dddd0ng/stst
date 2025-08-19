package chap1T;

public class MovieReviewMain {
    public static void main(String[] args) {

        //title ,review

        MovieReview[] mr = new MovieReview[2];


        MovieReview mr1 = new MovieReview();
        mr1.title = "인셉션";
        mr1.review = "인생은 무한 루프";
        mr[0] = mr1;


        MovieReview mr2 = new MovieReview();
        mr2.title = "어바웃 타임";
        mr2.review = "인생 시간 영화!";
        mr[1] = mr2;


        for (MovieReview movieReview : mr) {
            System.out.println("영화 제목 : " +  movieReview.title + ", 영화 리뷰 : " + movieReview.review);
        }

//
//        System.out.println("영화 제목 :" + mr[0].title + ", 영화 리뷰 : " + mr[0].review);
//        System.out.println("영화 제목 :"+ mr[1].title + ", 영화 리뷰 : " + mr[1].review);
//
//
    }
}
