package com.gcr.scripts;

import org.testng.annotations.Test;

import com.gcr.config.StartBrowser;
import com.gcr.reuse.CommonFunctions;

public class TC3 extends StartBrowser{
  @Test
  public void OnlyLoginLogut() throws Exception {
	  CommonFunctions cfs = new CommonFunctions();
	  cfs.login();
//	  this is new lin
	  cfs.logout();
  }

}