document.addEventListener('DOMContentLoaded', () => {
    const searchInput = document.querySelector('.search-bar input');
    const searchButton = document.querySelector('.search-bar button');

    searchButton.addEventListener('click', () => {
        const query = searchInput.value.trim();
        if (query) {
            alert(`Buscando cursos sobre: ${query}`);
            // Here you can add functionality to filter courses based on the search query
        } else {
            alert('Por favor, ingresa un término de búsqueda.');
        }
    });

    // Optional: Add functionality to handle pressing "Enter" in the search input
    searchInput.addEventListener('keypress', (event) => {
        if (event.key === 'Enter') {
            searchButton.click();
        }
    });
});