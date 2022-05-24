package tp.course.myquiz

import java.lang.Math.random


object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWER: String = "correct_answer"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()


        //1
        val que1 = Question(
            1, "A qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia", "Armenia", "Austria",
            1
        )
        questionsList.add(que1)
        // 2
        val que2 = Question(
            2, "A qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_australia,
            "Angola", "Austria",
            "Australia", "Armenia", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "A qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_brazil,
            "Belarus", "Belize",
            "Brunei", "Brasil", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "A qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_belgium,
            "Bahamas", "Belgica",
            "Barbados", "Belize", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "A qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_fiji,
            "Gabon", "França",
            "Fiji", "Finlandia", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "A qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_germany,
            "Alemanha", "Georgia",
            "Grecia", "none of these", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "A qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_denmark,
            "Dominica", "Egito",
            "Dinamarca", "Etiopia", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "A qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_india,
            "Irlanda", "Irã",
            "Hungria", "India", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "A qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia", "Nova Zelandia",
            "Tuvalu", "EUA", 2
        )



        // 10
        val que10 = Question(
            10, "A qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudao", "Palestina", 1
        )



        val que11 = Question(11, "A qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_eslovenia,
            "Eslovenia", "Latvia",
            "Bahamas", "Colombia", 1)



        questionsList.addAll(questionsList.shuffled().take((1..10).random()))



        while (questionsList.count() >= 11) {
            questionsList.removeAt(random().toInt())
        }
        return questionsList
    }
}


