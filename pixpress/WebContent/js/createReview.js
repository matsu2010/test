$(function () {

    maxReviewTitle();
    maxReviewBody();



    $('.reviewTitle-form').on('input', function () {

        maxReviewTitle();

    });

    function maxReviewTitle() {

        var reviewTitleLength = 15 - $('.reviewTitle-form').val().length;

        if (reviewTitleLength < 0) {

            reviewTitleLength = 0;
        }

        $('.max-reviewTitle').text(reviewTitleLength);

    }

    $('.reviewBody-form').on('input', function () {

        maxReviewBody();

    });

    function maxReviewBody() {

        var reviewBodyLength = 250 - $('.reviewBody-form').val().length;

        if (reviewBodyLength < 0) {

            reviewBodyLength = 0;
        }

        $('.max-reviewBody').text(reviewBodyLength);

    }


});
