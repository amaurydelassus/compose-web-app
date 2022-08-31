package com.sample.content

data class SocialLink(
    val id: String,
    val url: String,
    val title: String,
    val iconSvg: String
)

fun getSocialLinks(): List<SocialLink> {
    return listOf(
        SocialLink("twitter", "https://twitter.com/amaury_delassus", "Amaury DELASSUS Twitter", "ic_twitter.svg"),
        SocialLink(
            "linkedin",
            "https://www.linkedin.com/in/amaury-delassus/",
            "Amaury DELASSUS Linkedin",
            "ic_linkedin.svg"
        ),
        SocialLink("github", "https://github.com/amaurydelassus/compose-web-app", "Amaury DELASSUS Github", "ic_github.svg"),
        SocialLink("mail", "mailto:amaury.delassus@gmail.com", "Amaury DELASSUS Mail", "ic_mail.svg")
    )
}