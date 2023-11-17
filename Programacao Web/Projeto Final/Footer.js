//Footer//

document.addEventListener("DOMContentLoaded", function() {
    const dateDisplay = document.getElementById("dateDisplay");
    const youRockText = document.getElementById("youRockText");
  
    // Exibir a data atual
    const currentDate = new Date();
    const options = {  year: 'numeric', month: 'long' };
    const formattedDate = currentDate.toLocaleDateString('en-US', options);
    dateDisplay.textContent = formattedDate;
  
    // Exibir a animação após um intervalo de tempo
    setTimeout(function() {
        youRockText.classList.remove("hidden");
    }, 3000); // Mostrar "You rock!" após 3 segundos
  });