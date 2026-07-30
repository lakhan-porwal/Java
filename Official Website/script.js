const header = document.querySelector('.site-header');
const toggleButton = document.querySelector('.menu-toggle');
const navLinks = document.querySelector('.nav-links');

window.addEventListener('scroll', () => {
  header.classList.toggle('scrolled', window.scrollY > 30);
});

toggleButton?.addEventListener('click', () => {
  const isOpen = navLinks.classList.toggle('open');
  toggleButton.setAttribute('aria-expanded', String(isOpen));
});

navLinks?.querySelectorAll('a').forEach((link) => {
  link.addEventListener('click', () => {
    navLinks.classList.remove('open');
    toggleButton?.setAttribute('aria-expanded', 'false');
  });
});
