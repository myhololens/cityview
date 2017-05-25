package com.cityview.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cityview.mapper.JobMapper;
import com.cityview.po.Job;
import com.cityview.service.JobService;

/**
* <p>Title: JobServiceImpl.java<／p>
* <p>Description:描述 <／p>
* <p>Copyright:版权 2017<／p>
* @author 沈先春
* @date 2017年5月19日
* @version 1.0cityview
*/
public class JobServiceImpl implements JobService{
	
	@Autowired
	private JobMapper jobMapper;
	
	
	@Override
	public void insertJoblist(List<Job> jobs) throws Exception {
		// TODO Auto-generated method stub
		jobMapper.insertJoblist(jobs);
	}


	@Override
	public List<Job> findCompanynatureTotal(String cityname) throws Exception {
		// TODO Auto-generated method stub
		return jobMapper.findCompanynatureTotal(cityname);
	}


	@Override
	public List<Job> findScaleTotal(String cityname) throws Exception {
		// TODO Auto-generated method stub
		return jobMapper.findScaleTotal(cityname);
	}
	
	@Override
	public List<Job> findindustry(String cityname) throws Exception {
		// TODO Auto-generated method stub
		return jobMapper.findindustry(cityname);
	}

	@Override
	public List<Job> findpriceExp(String cityname) throws Exception {
		// TODO Auto-generated method stub
		return jobMapper.findpriceExp(cityname);
	}


	@Override
	public List<Job> findpriceEducation(String cityname) throws Exception {
		// TODO Auto-generated method stub
		return jobMapper.findpriceEducation(cityname);
	}


	@Override
	public List<Job> finddemandExp(String cityname) throws Exception {
		// TODO Auto-generated method stub
		return jobMapper.finddemandExp(cityname);
	}


	@Override
	public List<Job> finddemandEducation(String cityname) throws Exception {
		// TODO Auto-generated method stub
		return jobMapper.finddemandEducation(cityname);
	}


	

}