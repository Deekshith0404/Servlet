function validateform(val){
let val=true;

let brandvalue=document.formname.brandname.value;

if(brandvalue.length<3 && brandvalue.value>30){
        setError('errormess','invalid size enter min size 3');
        val=false;
}


 function setError(id,messsage){
        document.getElementById(id).innerText=messsage;
    }
return val;
}