const calculate = () => {
    let amount = document.getElementById("amount").value;
    let percentage = document.getElementById("percentage").value;
    let tipElement = document.getElementById("tip");
    let totalElement = document.getElementById("total");
  
    console.log(amount);
    console.log(percentage);
    console.log(amount * (percentage / 100));
    let tip = amount * (percentage / 100);
    tipElement.value = tip;
    totalElement.value = Number(amount) + tip;
    
  };