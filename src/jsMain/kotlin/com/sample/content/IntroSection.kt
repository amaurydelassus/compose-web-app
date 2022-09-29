package com.sample.content

import androidx.compose.runtime.*
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import com.sample.components.ContainerInSection
import com.sample.style.*

@Composable
fun Intro() {
    ContainerInSection(WtSections.Home)  {
        Div({
            classes(WtRows.wtRow, WtRows.wtRowSizeM, WtRows.wtRowSmAlignItemsCenter,WtSections.Home)
            style {
                justifyContent(JustifyContent.Center)
                flexWrap(FlexWrap.Wrap)
            }
        }) {
            Img(src = "profile.jpeg", attrs = { classes(AppStylesheet.PhotoDeProfil) })

            Div({
                classes(
                    WtCols.wtCol10,
                    WtCols.wtColMd8,
                    WtCols.wtColSm12,
                    WtOffsets.wtTopOffsetSm12,
                )
            }) {
                    IntroAboutComposeWeb()
            }

            Link()
        }
    }
}

@Composable
private fun IntroAboutComposeWeb() {
    Div({
        classes(WtRows.wtRow, WtRows.wtRowSizeM, WtRows.wtRowSmAlignItemsCenter)
        style {
            justifyContent(JustifyContent.Center)
            flexWrap(FlexWrap.Wrap)
        }
    }) {
        H1(attrs = {
            classes(
                WtTexts.wtHero, WtTexts.wtH2ThemeDark
            )
        }) {
            Text("Amaury ")
            Span({
                style {
                    display(DisplayStyle.InlineBlock)
                    whiteSpace("nowrap")
                }
            }) {
                Text("DELASSUS")
            }
        }

        P({ classes(WtTexts.wtSubtitle2, WtOffsets.wtTopOffset24,WtTexts.wtH2ThemeDark) }) {
            Text("Développeur mobile (android) chez ")

           A(href = "https://fr.worldline.com/fr/home.html", attrs = {
                classes(WtTexts.wtLink)
                target(ATarget.Blank)
            }) {
                Text("Worldline")
            }
        }
    }
}
