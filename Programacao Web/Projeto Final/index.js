//Acordion//

document.addEventListener("DOMContentLoaded", function() {
    const accordionHeaders = document.querySelectorAll(".accordion-header");
  
    accordionHeaders.forEach(header => {
      header.addEventListener("click", function() {
        const content = this.nextElementSibling;
        if (content.style.display === "block") {
          content.style.display = "none";
        } else {
          accordionHeaders.forEach(header => {
            header.nextElementSibling.style.display = "none";
          });
          content.style.display = "block";
        }
      });
    });
  });




