package ltd.matrixstudios.website.login.form

data class BasaltFormSubmission(
    val username: String = "Guest",
    val password: String? = null,
    val secret: String? = null
)
