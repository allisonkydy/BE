package com.bookr.backend.services;

import com.bookr.backend.models.Review;


public interface ReviewService
{
    void delete(long id);

    Review update(Review review, long id); //S may be needed.

    Review save(Review review);


}
