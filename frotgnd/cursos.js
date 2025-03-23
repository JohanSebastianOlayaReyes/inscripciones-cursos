const words = ["Inglés", "Programación", "Diseño"];
let i = 0;
let j = 0;
let currentWord = "";
let isDeleting = false;
const input = document.getElementById("animated-input");

function type() {
    if (i < words.length) {
        if (!isDeleting && j <= words[i].length) {
            currentWord = words[i].substring(0, j);
            j++;
            input.placeholder = currentWord;
        }

        if (isDeleting && j <= words[i].length) {
            currentWord = words[i].substring(0, j);
            j--;
            input.placeholder = currentWord;
        }

        if (j == words[i].length) {
            isDeleting = true;
        }

        if (isDeleting && j === 0) {
            currentWord = "";
            isDeleting = false;
            i++;
            if (i === words.length) {
                i = 0;
            }
        }
    }
    const speed = isDeleting ? 100 : 200;
    setTimeout(type, speed);
}

type();

// Modal functionality
const loginBtn = document.getElementById("loginBtn");
const modal = document.getElementById("loginModal");
const closeBtn = document.getElementById("closeBtn");

loginBtn.onclick = function() {
    modal.style.display = "block";
}

closeBtn.onclick = function() {
    modal.style.display = "none";
}

window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}
