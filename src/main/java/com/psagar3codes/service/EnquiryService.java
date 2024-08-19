package com.psagar3codes.service;

import java.util.List;

import com.psagar3codes.binding.DashboardResponse;
import com.psagar3codes.binding.EnquiryForm;
import com.psagar3codes.binding.EnquirySearchCriteria;

public interface EnquiryService {

	public List<String> getCourseNames();
	
	public List<String> getEnqStatus();
	
	public DashboardResponse getDashboardData(Integer userId);

	public String upsertEnquiry(EnquiryForm form);

	public List<EnquiryForm> getEnquries(Integer userId, EnquirySearchCriteria criteria);
	
	public EnquiryForm getEnquiry(Integer enqId);
}
