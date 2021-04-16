package com.example.happybirthday

object Constants{

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What three words best describe your personality?",
            R.drawable.cutecat,
            "Fun, playful and friendly",
            "Creative, decisive and clever",
            "Chill, easy-going, and laid-back",
            "Passionate, emotional and protective",
            1
        )

        questionsList.add(que1)

        //2
        val que2 = Question(
            2,
            "Which of these animals do you like the most?",
            R.drawable.cutecat,
            "Dogs",
            "Horses",
            "Butterflies",
            "Dolphins",
            1
        )

        //3
        val que3 = Question(
            3,
            "Which color combo do you like the most?",
            R.drawable.cutecat,
            "Black and brown",
            "Blue and green",
            "Red and orange",
            "Green and purple",
            1
        )

        //4
        val que4 = Question(
            4,
            "What's your favorite movie genre?",
            R.drawable.cutecat,
            "Thriller, mystery, horror",
            "Thriller, mystery, horror",
            "Adventure and romantic",
            "Drama or educational documentaries",
            1
        )

        //5
        val que5 = Question(
            5,
            "How many friends do you have?",
            R.drawable.cutecat,
            "A few different groups with a couple people in each",
            "About 5-10",
            "Just 2-3 close friends",
            "A huge group of wonderful friends",
            1
        )

        //6
        val que6 = Question(
            6,
            "Which of these music genres do you like the most?",
            R.drawable.cutecat,
            "Soft rock",
            "Heavy metal",
            "Classical",
            "Latest hits",
            1
        )

        //7
        val que7 = Question(
            7,
            " Which magical charm would you like to have?",
            R.drawable.cutecat,
            "Something that would make me completely free or extremely powerful",
            "Probably invincibility or immortality",
            "Something that would bring me more attention and love",
            "Wisdom or a unique skill of some sort",
            1
        )

        //8
        val que8 = Question(
            8,
            "If someone you love died, how would you handle it?",
            R.drawable.cutecat,
            "I'd definitely grieve and cry for a very long time",
            "It would be hard but I'd try to accept that they're gone",
            "I'd remember all the good times together and focus on the positive to make the pain go away",
            "I'd give it some time to sink in and left myself feel all the emotions that would come with it",
            1
        )

        //9
        val que9 = Question(
            9,
            "If you had 1 million dollars, what would you do with it?",
            R.drawable.cutecat,
            "Donate it to a charity",
            "Save it",
            "Spend all of it",
            "Give half to family and spend the other half helping the homeless",
            1
        )

        //10
        val que10 = Question(
            10,
            "How would you describe your life?",
            R.drawable.cutecat,
            "A big spotlight of attention!",
            "Full of fun and positive vibes",
            "Emotional",
            "A bit modest but full of love",
            1
        )

        return questionsList
    }
}