document.getElementById('program').addEventListener('change', function() {
    const selectedProgram = this.value;
    const courseSelect = document.getElementById('course');
    Array.from(courseSelect.options).forEach(option => {
        if (!option.value) return;
        option.style.display = option.getAttribute('data-program') === selectedProgram ? '' : 'none';
    });
    courseSelect.value = '';
});
