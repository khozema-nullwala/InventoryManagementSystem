<h1>Inventory Management System</h1>
<div class="navbar">
	<a href="${contextRoot}/index.jsp">Home</a>
	<div class="dropdown">
		<button class="dropbtn">Entry</button>

		<div class="dropdown-content">
			<a href="${contextRoot}/purchaseEntry.html">Purchase Entry</a>
		</div>
	</div>
	<%--   <a href="${contextRoot}/paymentTracker.html">Payment Tracker</a> --%>
	<div class="dropdown">
		<button class="dropbtn">Report</button>
		<div class="dropdown-content">
			<a href="${contextRoot}/loadDateWisePurchaseDetailPage.html">PurchaseReport - Datewise</a> 
			<a href="${contextRoot}/loadVendorWisePurchaseReportPage.html">Vendor - Purchased Item Report</a> 
			<a href="${contextRoot}/loadDateWisePaymentDetailPage.html">Vendor - Payment History</a> 
			<a href="${contextRoot}/loadDateWiseVendorPurchaseReport.html">Vendor - Purchase History</a>
		</div>
	</div>
	<!-- <a  href="${contextRoot}/index.jsp">Logout</a> -->
</div>