var paymentDetail = "";

goog.require('goog.dom');

function showTransactioinDetail(){
	
	
	//
	var mainHeader = goog.dom.createDom('h2', {'style': 'background-color:#EEE'},
		    'Date', '    ','Amount' );
	goog.dom.appendChild(document.body, mainHeader);
	for(var index in paymentDetail){
	var newHeader = goog.dom.createDom('h4', {'style': 'background-color:#EEE'},
		    ''+paymentDetail[index].amount+'',''+paymentDetail[index].responseMessege+'');
	
	  goog.dom.appendChild(document.body, newHeader);
//	
	  }
	
  
}



function getTransactionWithLimit(){
	var businessId = document.getElementById("businessId").value;
	var startDtate = document.getElementById("datepicker").value;
	var endDate = document.getElementById("datepicker1").value;
	alert(businessId);
	alert(startDtate);
	alert(endDate);
	 $.ajax
	  (
	   {type: 'GET', url: '/api/ReportTranasactionController/getdayReportWithBusiness' ,data:"businessId="+businessId+"&startDtate="+startDtate+"&endDate="+endDate,success: function(data)
     {
	    	
	    if(data!=null){
	    	
	    	if(data.indexOf("Invalid") >= 0){
	    		alert(data);
	    		return;
	    	}
	    }
	    paymentDetail= data ;
	    alert("i have got the information:"+paymentDetail);
	    showTransactioinDetail();
	   
     }
  });
	  
	
}


	function businessDetail(){
		$.ajax(
				{type: 'POST', url: '/api/PayPalservices/businessDetail' , success: function(data)
					{
					if(data!=null){
					var businessDetail = data ;
					}
					var selectId = document.getElementById("businessId");
					for(index in businessDetail){
						console.log("inside for loop"+index)
						var option=document.createElement("option");
						option.value=index
						option.innerHTML=businessDetail[index]
						selectId.appendChild(option);
					}
					}
				}
		); 
 
	}
	
	
	

