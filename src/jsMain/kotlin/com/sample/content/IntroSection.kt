package com.sample.content

import androidx.compose.runtime.*
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import com.sample.components.ContainerInSection
import com.sample.style.*
import org.w3c.dom.HTMLElement

@Composable
fun Intro() {
    ContainerInSection {
        Div({
            classes(WtRows.wtRow, WtRows.wtRowSizeM, WtRows.wtRowSmAlignItemsCenter)
        }) {

            Div({
                classes(WtCols.wtCol2, WtCols.wtColMd3)
                style {
                    alignSelf(AlignSelf.Start)
                }
            }) {
                Img(src = "profile.jpeg", attrs = { classes(AppStylesheet.composeLogo) })
            }

            Div({
                classes(
                    WtCols.wtCol10,
                    WtCols.wtColMd8,
                    WtCols.wtColSm12,
                    WtOffsets.wtTopOffsetSm12
                )
            }) {
                H1(attrs = { classes(WtTexts.wtHero) }) {
                    Text("Amaury ")
                    Span({
                        classes(WtTexts.wtHero)
                        style {
                            display(DisplayStyle.InlineBlock)
                            whiteSpace("nowrap")
                        }
                    }) {
                        Text("DELASSUS")
                    }
                }
                Div({
                    classes(WtDisplay.wtDisplayMdNone)
                }) {
                    IntroAboutComposeWeb()
                }
            }
        }


        Div(attrs = {
            classes(WtDisplay.wtDisplayNone, WtDisplay.wtDisplayMdBlock)
        }) {
            IntroAboutComposeWeb()
        }
    }
}

@Composable
private fun IntroAboutComposeWeb() {
    Div({
        classes(WtRows.wtRow, WtRows.wtRowSizeM)
    }) {

        Div({
            classes(WtCols.wtCol9, WtCols.wtColMd9, WtCols.wtColSm12)
        }) {
            P({ classes(WtTexts.wtSubtitle2, WtOffsets.wtTopOffset24) }) {
                Text("Actuellement apprentie développeur mobile (android) chez ")

                A(href = "https://fr.worldline.com/fr/home.html", attrs = {
                    classes(WtTexts.wtLink)
                    target(ATarget.Blank)
                }) {
                    Text("Worldline")
                }

                Text(", j'ai la chance de travailler sur de nombreuses techno telle que kotlin, firebase, gitlabs, jetpack compose ... ")
            }

            P({
                classes(WtTexts.wtText1, WtOffsets.wtTopOffset24)
            }) {
            Text("Passionné par l'informatique et les nouvelles technologies, je passe une bonne partie de mon temps libre pour apprendre et tester de nouvelles choses. Je vous explique certaine d'entre elle sur ce site ou mon repo github.\n")
        }
            A(
                attrs = {
                    classes(WtTexts.wtButton, WtOffsets.wtTopOffset24)
                    target(ATarget.Blank)
                },
                href = "https://github.com/amaurydelassus"
            ) {
                Text("Explore on GitHub")
            }
        }
    }
}

@Composable
private fun IntroCodeSample() {
    Div({
        style {
            marginTop(24.px)
            backgroundColor(rgba(39, 40, 44, 0.05))
            borderRadius(8.px)
            property("font-family", "'JetBrains Mono', monospace")
        }
    }) {
        Div({
            style {
                property("padding", "12px 16px")
            }
        }) {
            FormattedCodeSnippet(
                code = """
                fun greet() = listOf("Hello", "Hallo", "Hola", "Servus").random()

                renderComposable("greetingContainer") {
                    var greeting by remember { mutableStateOf(greet()) }
                    Button(attrs = { onClick { greeting = greet() } }) {
                        Text(greeting)
                    }
                } 
            """.trimIndent()
            )
        }

        Hr({
            style {
                height(1.px)
                border(width = 0.px)
                backgroundColor(rgba(39, 40, 44, 0.15))
            }
        })

        IntroCodeSampleResult()
    }
}

@Composable
private fun IntroCodeSampleResult() {
    Div({
        style {
            property("padding", "12px 16px")
            display(DisplayStyle.Flex)
            flexDirection(FlexDirection.Row)
            alignItems(AlignItems.Center)
        }
    }) {
        Span({
            classes(WtTexts.wtText2)
            style {
                marginRight(8.px)
            }
        }) {
            Text("Result:")
        }

        fun greet() = listOf("Hello", "Hallo", "Hola", "Servus").random()

        Div({
            id("greetingContainer")
        }) {
            var greeting by remember { mutableStateOf(greet()) }
            Button(attrs = { onClick { greeting = greet() } }) {
                Text(greeting)
            }
        }
    }
}
