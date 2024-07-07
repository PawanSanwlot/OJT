document.addEventListener("DOMContentLoaded", () => {
    const teamMembers = document.querySelectorAll(".team-member");

    teamMembers.forEach(member => {
        member.addEventListener("click", () => {
            alert(`${member.textContent} clicked!`);
        });
    });
});
