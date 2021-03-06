package com.mvc.forrest.dao.rentalreview;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mvc.forrest.service.domain.RentalReview;
import com.mvc.forrest.service.domain.Search;



@Mapper
public interface RentalReviewDAO {
	
	void addRentalReview(RentalReview rentalReview) throws Exception;
	
	void deleteRentalReview(int reviewNo) throws Exception;
	
	RentalReview getRentalReview(RentalReview rentalReview) throws Exception;
	
	int getTotalCount(Search search) throws Exception;	
	
	void updateRentalReview(RentalReview rentalReview) throws Exception;
	
	List<RentalReview> getRentalReviewList(String prodNo) throws Exception;
}
