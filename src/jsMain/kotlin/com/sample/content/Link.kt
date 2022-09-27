package com.sample.content

import androidx.compose.runtime.Composable
import com.sample.components.SocialIconLink
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import com.sample.style.*


@Composable
fun Link() {
    Div({
        classes(WtCols.wtColInline)
    }) {
        getSocialLinks().forEach { SocialIconLink(it) }
    }
}