package net.minebo.basalt.repository

/**
 * Class created on 1/11/2024

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
data class BasaltRepositoryOverview(
    val name: String,
    val files: List<BasaltJarFile>,
    val type: String
) {

    data class BasaltJarFile(
        val name: String,
        val type: String,
        val contentType: String? = null,
        val contentLength: Int? = null
    )
}