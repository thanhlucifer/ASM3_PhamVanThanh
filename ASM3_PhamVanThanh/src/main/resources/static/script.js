function registerCourse(courseId) {
    $.ajax({
        type: "POST",
        url: "/registerCourse",
        data: { courseId: courseId },
        success: function() {
            alert("Đăng ký khóa học thành công!");
            location.reload(); // Reload the page to update the course list
        },
        error: function() {
            alert("Đăng ký khóa học thất bại!");
        }
    });
}