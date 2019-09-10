<h1>Inventory Management System</h1>
<div class="navbar">
  <a href="${contextRoot}/index.jsp"><i class="fa fa-fw fa-home"></i> Home</a> 
 <div class="dropdown">
    <button class="dropbtn">Entry<i class="fa fa-caret-down"></i> </button>
   
    <div class="dropdown-content">
      <a href="${contextRoot}/purchaseEntry.html">Purchase Entry</a>     
    </div>
  </div> 
<%--   <a href="${contextRoot}/paymentTracker.html"><i class="fa fa-fw fa-home"></i> Payment Tracker</a> 
 --%>  
 	<div class="dropdown">
    <button class="dropbtn">Report<i class="fa fa-caret-down"></i> </button>
    <div class="dropdown-content">
      <a href="${contextRoot}/loadDateWisePurchaseDetailPage.html">Purchase Report - Datewise</a>
      <a href="${contextRoot}/loadVendorWisePurchaseReportPage.html">Vendor - Purchased Item Report</a>
      <a href="${contextRoot}/loadDateWisePaymentDetailPage.html">Vendor - Payment History</a>
      <a href="${contextRoot}/loadDateWiseVendorPurchaseReport.html">Vendor - Purchase History</a>
    </div>
  </div> 
<!--    <a  href="index.jsp"><i class="fa fa-fw fa-user"></i> Logout</a>
 -->
 </div>