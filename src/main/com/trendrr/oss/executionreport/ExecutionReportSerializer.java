/**
 * 
 */
package com.trendrr.oss.executionreport;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.trendrr.oss.TimeAmount;
import com.trendrr.oss.Timeframe;


/**
 * @author Dustin Norlander
 * @created Sep 20, 2011
 * 
 */
public interface ExecutionReportSerializer {

	public void save(ExecutionReport report, List<ExecutionReportPoint> points);
	
	public void saveChildren(String parentFullname, Collection<String> childrenFullnames, Date date, TimeAmount timeamount);
	/**
	 * should return the fullnames of the next children
	 * @param parentFullname
	 * @return
	 */
	public List<String> findChildren(String parentFullname, Date date, TimeAmount timeamount);
	
	public List<ExecutionReportPoint> load(String fullname, Date start, Date end, TimeAmount timeamount);
	
	public List<ExecutionReportChildPoints> loadChildren(String fullname, Date start, Date end, TimeAmount timeamount);
	
}
