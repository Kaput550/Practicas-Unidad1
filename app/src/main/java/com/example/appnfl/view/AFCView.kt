package com.example.appnfl.view

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.appnfl.components.ActionButton
import com.example.appnfl.components.ButtonWithIcon
import com.example.appnfl.components.Space
import com.example.appnfl.components.TextView
import com.example.appnfl.components.TitleBar
import com.example.appnfl.R

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun AFCView(navController: NavController){
    Scaffold(){
        ContentAFCView(navController)
    }
}


@Composable
fun ContentAFCView(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize().background(Color(0xFFD50A0A)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        ButtonWithIcon(
            name="",
            iconResId = R.drawable.buffalo_bills,
            size = 125
        )
        {
            navController.navigate("Bills")
        }
        Space(espacio = 20)
        ButtonWithIcon(
            name="",
            iconResId = R.drawable.jets,
            size = 125
        )
        {
            navController.navigate("Jets")
        }
        Space(espacio = 20)
        ButtonWithIcon(
            name="",
            iconResId = R.drawable.miami_dolphins,
            size = 125
        )
        {
            navController.navigate("Dolphins")
        }
        Space(espacio = 20)
        ButtonWithIcon(
            name="",
            iconResId = R.drawable.patriots,
            size = 125
        )
        {
            navController.navigate("Patriots")
        }
    }
}

//BUFFALO BILLS
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun BillsView(){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar("Buffalo Bills") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color(0xFFD50A0A)
                )
            )
        }
    ){
        ContentBills()
    }
}

@Composable
fun ContentBills()
{
    LazyColumn(
        modifier = Modifier.fillMaxSize().background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        item {
            Space(espacio = 100)
            Image(
                painter = painterResource(id = R.drawable.buffalo_bills),
                modifier = Modifier.fillMaxWidth(0.90f),
                contentDescription = "Logo"
            )
            Space(espacio = 20)
        }
        item{
            Text(
                text = "ORCHARD PARK, N.Y. – The Buffalo Bills continue to show why they are one of the top contenders in the AFC. With quarterback Josh Allen leading a dynamic offense and a defense that's creating turnovers at a critical rate, the Bills are looking to make a deep playoff run this season.\n" +
                        "\n" +
                        "After a dominant performance in Week 4, the Bills improved their record and sit atop the AFC East standings. Allen threw for 275 yards and three touchdowns, showcasing his elite arm talent and decision-making ability. His connection with wide receiver Stefon Diggs remains one of the most dangerous combinations in the NFL.\n" +
                        "\n" +
                        "\"We're hitting our stride at the right time,\" Allen said in his postgame interview. \"The offensive line gave me time, the receivers made plays, and our defense was outstanding. When we play like this, we can beat anyone.\"\n" +
                        "\n" +
                        "Defensively, the Bills have been a force to reckon with. Led by edge rusher Von Miller and safety Jordan Poyer, Buffalo's defense recorded three sacks and two interceptions in their latest victory. The ability to pressure opposing quarterbacks while maintaining tight coverage has been a key factor in their success.\n" +
                        "\n" +
                        "Head coach Sean McDermott emphasized the importance of staying focused as the season progresses. \"We've got a talented group, but we can't get complacent. Every week in this league is a challenge, and we need to bring our A-game every Sunday.\"\n" +
                        "\n" +
                        "The Bills' running game has also shown improvement, with James Cook averaging over 80 rushing yards per game. The balanced attack keeps defenses guessing and opens up opportunities in the passing game.\n" +
                        "\n" +
                        "As the Bills prepare for their next matchup, the team remains confident in their ability to compete for a Super Bowl. With a high-powered offense, opportunistic defense, and strong leadership, Buffalo is a team to watch this season.",
                modifier = Modifier.fillMaxWidth(0.95f).border(2.dp, Color.Black),
                textAlign = androidx.compose.ui.text.style.TextAlign.Justify,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }
    }
}

//NEW YORK JETS
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun JetsView(){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar("New York Jets") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color(0xFFD50A0A)
                )
            )
        }
    ){
        ContentJets()
    }
}

@Composable
fun ContentJets()
{
    LazyColumn(
        modifier = Modifier.fillMaxSize().background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        item {
            Space(espacio = 100)
            Image(
                painter = painterResource(id = R.drawable.jets),
                modifier = Modifier.fillMaxWidth(0.90f),
                contentDescription = "Logo"
            )
            Space(espacio = 20)
        }
        item{
            Text(
                text = "FLORHAM PARK, N.J. – The New York Jets are in the midst of a crucial stretch as they look to secure a playoff spot for the first time in over a decade. With veteran quarterback Aaron Rodgers at the helm, the Jets have shown flashes of brilliance but need consistency to make a postseason push.\n" +
                        "\n" +
                        "Rodgers, who joined the Jets in a blockbuster trade, has been working to build chemistry with his new receivers. Despite some early-season struggles, the four-time MVP is beginning to find his rhythm in offensive coordinator Nathaniel Hackett's system.\n" +
                        "\n" +
                        "\"It's all about trusting the process,\" Rodgers said after practice. \"We've got talented players, and when we execute, we're tough to stop. It's about staying disciplined and playing complementary football.\"\n" +
                        "\n" +
                        "The Jets' defense has been the team's backbone this season. Led by cornerback Sauce Gardner and defensive lineman Quinnen Williams, New York ranks in the top 10 in total defense. Their ability to shut down opposing passing attacks has given the Jets a chance to win even when the offense sputters.\n" +
                        "\n" +
                        "Head coach Robert Saleh remains optimistic about his team's trajectory. \"We're building something special here. Our defense is playing at an elite level, and once the offense clicks consistently, we'll be a dangerous team.\"\n" +
                        "\n" +
                        "Running back Breece Hall has been a bright spot, averaging over 90 yards from scrimmage per game. His explosive playmaking ability gives the Jets a dual-threat weapon that can change the complexion of any game.\n" +
                        "\n" +
                        "The Jets face a challenging schedule ahead, but with Rodgers leading the way and a stout defense, New York believes they have the pieces to end their playoff drought. \"We're right there,\" Gardner said. \"We just need to put it all together and finish strong.\"",
                modifier = Modifier.fillMaxWidth(0.95f).border(2.dp, Color.Black),
                textAlign = androidx.compose.ui.text.style.TextAlign.Justify,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }
    }
}

//MIAMI DOLPHINS
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DolphinsView(){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar("Miami Dolphins") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color(0xFFD50A0A)
                )
            )
        }
    ){
        ContentDolphins()
    }
}

@Composable
fun ContentDolphins()
{
    LazyColumn(
        modifier = Modifier.fillMaxSize().background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        item {
            Space(espacio = 100)
            Image(
                painter = painterResource(id = R.drawable.miami_dolphins),
                modifier = Modifier.fillMaxWidth(0.90f),
                contentDescription = "Logo"
            )
            Space(espacio = 20)
        }
        item{
            Text(
                text="MIAMI GARDENS, Fla. – The Miami Dolphins are living up to their billing as one of the most explosive offenses in the NFL. With quarterback Tua Tagovailoa orchestrating an up-tempo attack and a receiving corps led by Tyreek Hill and Jaylen Waddle, Miami's offense has been virtually unstoppable.\n" +
                        "\n" +
                        "Through the first quarter of the season, the Dolphins are averaging over 30 points per game, making them one of the highest-scoring teams in the league. Tagovailoa has been exceptional, completing passes at a high rate and spreading the ball to his playmakers with precision.\n" +
                        "\n" +
                        "\"Speed kills, and we've got it everywhere,\" Tagovailoa said. \"When you have guys like Tyreek and Jaylen who can take it to the house on any play, it makes my job easier. We just have to keep the pedal down.\"\n" +
                        "\n" +
                        "Hill, in particular, has been a game-changer. The All-Pro receiver is on pace for another 1,500-yard season and continues to terrorize defenses with his blazing speed. Waddle complements Hill perfectly, providing a versatile threat both in the slot and on the outside.\n" +
                        "\n" +
                        "Head coach Mike McDaniel's innovative play-calling has been a key factor in Miami's offensive success. His ability to create mismatches and get his playmakers in space has made the Dolphins one of the most fun teams to watch in the NFL.\n" +
                        "\n" +
                        "While the offense grabs headlines, Miami's defense has also made strides. Edge rusher Jaelan Phillips and cornerback Jalen Ramsey have been instrumental in improving a unit that struggled last season.\n" +
                        "\n" +
                        "\"We're not just an offensive team,\" McDaniel emphasized. \"Our defense is playing with confidence and making big plays when we need them. That balance is what's going to carry us through the season.\"\n" +
                        "\n" +
                        "As the Dolphins eye a division title and playoff success, the combination of offensive firepower and an improving defense has Miami believing this could be their year.",
                modifier = Modifier.fillMaxWidth(0.95f).border(2.dp, Color.Black),
                textAlign = androidx.compose.ui.text.style.TextAlign.Justify,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }
    }
}

//NEW ENGLAND PATRIOTS
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun PatriotsView(){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar("New England Patriots") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color(0xFFD50A0A)
                )
            )
        }
    ){
        ContentPatriots()
    }
}

@Composable
fun ContentPatriots()
{
    LazyColumn(
        modifier = Modifier.fillMaxSize().background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        item {
            Space(espacio = 100)
            Image(
                painter = painterResource(id = R.drawable.patriots),
                modifier = Modifier.fillMaxWidth(0.90f),
                contentDescription = "Logo"
            )
            Space(espacio = 20)
        }
        item{
            Text(
                text= "FOXBOROUGH, Mass. – The New England Patriots are in a transition period as they work to rebuild their roster and develop a new identity in the post-Tom Brady era. Under head coach Bill Belichick, the Patriots are taking a patient approach to their rebuild while remaining competitive.\n" +
                        "\n" +
                        "Young quarterback Mac Jones is showing steady improvement in his development. The former first-round pick has displayed poise in the pocket and an improving command of the offense. While the numbers haven't always been eye-popping, Jones has shown the intangibles that made New England draft him.\n" +
                        "\n" +
                        "\"We're building for the long term,\" Jones said. \"Coach Belichick has a plan, and we're all buying in. There are growing pains, but we're getting better every week.\"\n" +
                        "\n" +
                        "The Patriots' defense remains the heart of the team. Belichick's defensive schemes continue to confuse opposing offenses, and players like linebacker Matthew Judon and defensive back Kyle Dugger have emerged as leaders on that side of the ball.\n" +
                        "\n" +
                        "New England's running game has also been a bright spot, with Rhamondre Stevenson establishing himself as a reliable workhorse back. His physical running style and ability to catch passes out of the backfield make him a valuable asset in the Patriots' offensive system.\n" +
                        "\n" +
                        "\"We're not where we want to be yet, but we're making progress,\" Belichick said in his weekly press conference. \"This is a process, and we need to stay focused on improving fundamentally and executing our game plan each week.\"\n" +
                        "\n" +
                        "The Patriots face an uphill battle in a competitive AFC East, but with Belichick's coaching acumen and a commitment to developing young talent, New England remains a team that opponents can't overlook.\n" +
                        "\n" +
                        "\"The Patriots way is about hard work and consistency,\" Judon said. \"We might not be the flashiest team, but we're going to compete every single week. That's the standard here.\"",
                modifier = Modifier.fillMaxWidth(0.95f).border(2.dp, Color.Black),
                textAlign = androidx.compose.ui.text.style.TextAlign.Justify,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }
    }
}

