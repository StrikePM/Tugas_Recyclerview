package com.example.a2018034_recyclerview.data;

import com.example.a2018034_recyclerview.R;
import com.example.a2018034_recyclerview.model.Champ;

import java.util.ArrayList;

public class ChampData {
    private static String [] champName = {
            "Fiora",
            "Gwen",
            "Sett",
            "Diana",
            "Darius",
    };

    private static String [] champRole = {
            "Baron Lane",
            "Jungle, Baron Lane",
            "Baron Lane",
            "Mid Lane, Baron Lane",
            "Baron Lane",
    };

    private static String [] champDiff = {
            "Very Hard",
            "Hard",
            "Hard",
            "Hard",
            "Easy",
    };

    private static String [] champStory = {
            "The most feared duelist in all Valoran, Fiora is as renowned for her brusque manner and political cunning as she is for the speed of her rapier. Born to the noble Laurent family in Demacia, Fiora claimed the household from her father in the wake of a scandal that nearly destroyed them—now she is dedicated to restoring the Laurents to their rightful place among the great and good of the kingdom.",
            "A former doll transformed and brought to life by magic, Gwen wields the very tools that once created her. She carries the weight of her maker’s love with every step, taking nothing for granted. At her command is the Hallowed Mist, an ancient and protective magic that has blessed Gwen’s scissors, needles, and sewing thread. So much is new to her, but Gwen remains joyfully determined to fight for the good that survives in a broken world.",
            "A leader of Ionia’s growing criminal underworld, Sett rose to prominence in the wake of the war with Noxus. Though he began as a humble challenger in the fighting pits of Navori, he quickly gained notoriety for his savage strength, and his ability to take seemingly endless amounts of punishment. Now, having climbed through the ranks of local combatants, Sett has muscled to the top, reigning over the pits he once fought in.",
            "Bearing her crescent moonblade and clad in shimmering armor the color of winter snow at night, Diana is a living embodiment of the silver moon’s power. Imbued with the essence of an Aspect from beyond Targon’s towering summit, Diana is no longer wholly human, and struggles to understand her power and purpose in this world.",
            "There is no greater symbol of Noxian might than Darius, the nation’s most feared and battle-hardened leader. Rising from humble origins to become the Hand of Noxus, he cleaves through the empire’s enemies—many of them Noxians themselves. Knowing that he never doubts his cause is just, and never hesitates once his axe is raised, those who stand against the commander of the Trifarian Legion can expect no mercy.",
    };
    private static int [] champImage = {
            R.drawable.fiora_0,
            R.drawable.gwen_0,
            R.drawable.sett_0,
            R.drawable.diana_0,
            R.drawable.darius_0,
    };

    public static ArrayList<Champ> getDataChamp() {
        ArrayList<Champ> list = new ArrayList<>();
        for(int i=0;i<champName.length;i++){
            Champ champ = new Champ(champName[i], champRole[i], champDiff[i], champStory[i], champImage[i]);
            list.add(champ);
        }
        return list;
    }
}
