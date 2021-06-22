package com.example.quizapp

object Constants {

    const val USER_NAME:String = "user_name"
    const val CORRECT_ANSWERS:String = "correct answers"

    fun getQuestions(): ArrayList<Questions>{

        val questionsList = ArrayList<Questions>()

        val questionOne = Questions(
            1,
            "What is this logo for?",
            R.drawable.atom,
            "Vim",
            "IntelliJ",
            "Atom",
            "Visual Studio",
            3
        )

        questionsList.add(questionOne)

        val questionTwo = Questions(
            2,
            "What is this logo for?",
            R.drawable.kotlin,
            "Kojo",
            "Kotlin",
            "Karel",
            "KornShell",
            2
        )

        questionsList.add(questionTwo)

        val questionThree = Questions(
            3,
            "What is this logo for?",
            R.drawable.java,
            "Java",
            "Javascript",
            "Jade",
            "Julia",
            1
        )

        questionsList.add(questionThree)

        val questionFour = Questions(
            4,
            "What is this logo for?",
            R.drawable.python,
            "Perl",
            "Pascal",
            "Pipelines",
            "Python",
            4
        )

        questionsList.add(questionFour)

        val questionFive = Questions(
            5,
            "What is this logo for?",
            R.drawable.swift,
           "SAS",
            "Scala",
            "Swift",
            "SQL",
            3
        )

        questionsList.add(questionFive)

        val questionSix = Questions(
            6,
            "What is this logo for?",
            R.drawable.rust,
            "Ruby",
            "Rust",
            "Rapira",
            "R",
            2
        )

        questionsList.add(questionSix)

        val questionSeven = Questions(
            7,
            "What is this logo for?",
            R.drawable.perl,
            "PHP",
            "GO",
            "Perl",
            "PowerShell",
            3
        )

        questionsList.add(questionSeven)

        val questionEight = Questions(
            8,
            "What is this logo for?",
            R.drawable.vscode,
            "IntelliJ",
            "Visual Studio",
            "Sublime",
            "Visual Studio Code",
            4
        )

        questionsList.add(questionEight)

        val questionNine = Questions(
            9,
            "What is this logo for?",
            R.drawable.ubuntu,
            "Opal",
            "Hadoop",
            "Ubuntu",
            "CentOS",
            3
        )

        questionsList.add(questionNine)

        val questionTen = Questions(
            10,
            "What is this logo for?",
            R.drawable.javascript,
            "Javascript",
            "Java",
            "Jade",
            "JASS",
            1
        )

        questionsList.add(questionTen)


        val questionEleven = Questions(
            11,
            "What is this logo for?",
            R.drawable.hadoop,
            "Spark",
            "Hadoop",
            "Azure",
            "Jenkins",
            2
        )

        questionsList.add(questionEleven)

        val questionTwelve = Questions(
            12,
            "What is this logo for?",
            R.drawable.kali,
            "Python",
            "Parrot",
            "Kali",
            "Arch",
            3
        )

        questionsList.add(questionTwelve)

        val questionThirteen = Questions(
            13,
            "What is this logo for?",
            R.drawable.youtube,
            "Spotify",
            "BS Player",
            "VLC",
            "Youtube",
            4
        )

        questionsList.add(questionThirteen)

        val questionFourteen = Questions(
            14,
            "What is this logo for?",
            R.drawable.twitter,
            "Instagram",
            "Twitter",
            "Facebook",
            "Snapchat",
            2
        )

        questionsList.add(questionFourteen)

        val questionFifteen = Questions(
            15,
            "What is this logo for?",
            R.drawable.powerbi,
            "Power BI",
            "Excel",
            "Rapid Miner",
            "Libre Office",
            1
        )

        questionsList.add(questionFifteen)

        val questionSixteen = Questions(
            16,
            "What is this logo for?",
            R.drawable.rog,
            "Legion",
            "MSI",
            "ROG",
            "Alienware",
            3
        )

        questionsList.add(questionSixteen)

        val questionSeventeen = Questions(
            17,
            "What is this logo for?",
            R.drawable.stackoverflow,
            "Firebase",
            "StackOverflow",
            "Google Drive",
            "Github",
            2
        )

        questionsList.add(questionSeventeen)

        val questionEighteen = Questions(
            18,
            "What is this logo for?",
            R.drawable.brave,
            "Edge",
            "Tor",
            "Brave",
            "Opera",
            3
        )

        questionsList.add(questionEighteen)

        val questionNineteen = Questions(
            19,
            "What is this logo for?",
            R.drawable.react,
            "Angular",
            "Atom",
            "Node JS",
            "React",
            4
        )

        questionsList.add(questionNineteen)

        val questionTwenty = Questions(
            20,
            "What is this logo for?",
            R.drawable.fsociety,
            "fsociety",
            "Anonymous",
            "Dark Army",
            "Derp",
            1
        )

        questionsList.add(questionTwenty)

        return questionsList
    }
}
