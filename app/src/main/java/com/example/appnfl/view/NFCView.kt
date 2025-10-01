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
fun NFCView(navController: NavController){
    Scaffold(){
        ContentNFCView(navController)
    }
}


@Composable
fun ContentNFCView(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize().background(Color(0xFF013369)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        ButtonWithIcon(
            name="",
            iconResId = R.drawable.carloina_panthers,
            size = 125
        )
        {
            navController.navigate("Panthers")
        }
        Space(espacio = 20)
        ButtonWithIcon(
            name="",
            iconResId = R.drawable.dallas_cowboys,
            size = 125
        )
        {
            navController.navigate("Cowboys")
        }
        Space(espacio = 20)
        ButtonWithIcon(
            name="",
            iconResId = R.drawable.new_york_giants,
            size = 125
        )
        {
            navController.navigate("Giants")
        }
        Space(espacio = 20)
        ButtonWithIcon(
            name="",
            iconResId = R.drawable.green_bay_packers,
            size = 125
        )
        {
            navController.navigate("Packers")
        }
    }
}

//PANTHERS
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun PanthersView(){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar("Carolina Panthers") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color(0xFF013369)
                )
            )
        }
    ){
        ContentPanthers()
    }
}

@Composable
fun ContentPanthers()
{
    LazyColumn(
        modifier = Modifier.fillMaxSize().background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        item {
            Space(espacio = 100)
            Image(
                painter = painterResource(id = R.drawable.new_panthers),
                modifier = Modifier.fillMaxWidth(0.90f),
                contentDescription = "Logo"
            )
            Space(espacio = 20)
        }
        item{
            Text(
                text = "CHARLOTTE — The Panthers have released their depth chart ahead of the Week 5 matchup against the Miami Dolphins. Following two transactions Tuesday afternoon, there are a couple of updates, one on each side of the ball.\n" +
                        "\n" +
                        "The club waived outside linebacker DJ Johnson and wide receiver Dalevon Campbell from the roster on Tuesday.\n" +
                        "\n" +
                        "Johnson started on Sunday, with both D.J. Wonnum and Patrick Jones II out due to injuries. With the release, the pass-rusher depth chart now has rookies Nic Scourton (who also started) and Princely Umanmielen directly behind the veterans Wonnum and Jones, with Thomas Incoom rounding out the unit.\n" +
                        "\n" +
                        "There were no changes to the wide receiver units on the depth chart ahead of Campbell. Second-year receiver Jalen Coker remains on Injured Reserve for the time being. The Panthers now have two open roster spots.",
                modifier = Modifier.fillMaxWidth(0.95f).border(2.dp, Color.Black),
                textAlign = androidx.compose.ui.text.style.TextAlign.Justify,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }
    }
}

//COWBOYS
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun CowboysView(){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar("Dallas Cowboys") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color(0xFF013369)
                )
            )
        }
    ){
        ContentCowboys()
    }
}

@Composable
fun ContentCowboys()
{
    LazyColumn(
        modifier = Modifier.fillMaxSize().background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        item {
            Space(espacio = 100)
            Image(
                painter = painterResource(id = R.drawable.news_dallas),
                modifier = Modifier.fillMaxWidth(0.90f),
                contentDescription = "Logo"
            )
            Space(espacio = 20)
        }
        item{
            Text(
                text = "FRISCO, Texas – Cowboys defensive tackle Solomon Thomas is having one of the strongest starts to a season in his career. After four games with the Cowboys, he's already halfway to his season total for tackles a year ago with 13, is tied for the most stuffs on the team with four, and is second in run stops with nine.\n" +
                        "\n" +
                        "Now, the eight-year veteran will go on the road with Dallas to face his former team in the New York Jets this coming Sunday, where his focus is set on getting the Cowboys back in the win column.\n" +
                        "\n" +
                        "\"Super excited to see my old teammates,\" Thomas said. \"I love those guys. I had a great time out there, super grateful for the fans, the community just giving me the chance to continue my career there. Very thankful for that, but mostly just ready to get up there and get a win, get better personally, and get better collectively.\n"+
                        "In three seasons with the Jets, Thomas played in 50 games and tallied 83 tackles, 14 tackles for loss and nine sacks. He learned and developed a lot under defensive line coach Aaron Whitecotton, who he followed to Dallas after Brian Schottenheimer hired Whitecotton for the same role on his inaugural coaching staff.\n" +
                        "\n" +
                        "While it'll be nice to go back and see some of his former teammates, going back to play at MetLife Stadium is bittersweet for Thomas. In Week 2 of the 2020 NFL season, Solomon Thomas' fourth year in the NFL with the San Francisco 49ers, he tore his ACL, which has been a recent trend at that stadium. Due to the nature of those kinds of injuries, Thomas has been an advocate for wanting grass fields league-wide.\n" +
                        "\n" +
                        "\"It's just frustrating as a league that we still have turf,\" Thomas said. All the best leagues in the world, like the Premier Soccer League, their players won't even practice on turf. You see guys league wide getting hurt on turf and it's just frustrating.\"\n" +
                        "\n" +
                        "Most recently, it was Giants star wide receiver Malik Nabers who suffered a season-ending ACL tear on Sunday, ending his second season just four games into the year. Former Cowboys defensive end Micah Parsons suffered an injury that sidelined him multiple weeks there last season.\n" +
                        "\n" +
                        "\"The statistics are there that it's worse for you, and guys just feel it,\" Thomas said. \"Guys will tell you, whether the statistics are there or not, guys will tell you that 'Hey, I feel worse on turf.' Always pushing for better services for our players, hopefully one day that'll happen.\"\n" +
                        "\n" +
                        "Nonetheless, Thomas knows he and his teammates will have to go there and be able to play without being timid. That is especially the case after a three straight weeks of allowing 30 or more points to opposing offenses, although Dallas nearly came away with a win in Sunday's 40-40 tie with the Green Bay Packers.\n" +
                        "\n" +
                        "Even though it hasn't all been pretty, Thomas believes that the unit is taking steps in the right direction\n" +
                        "\n" +
                        "\"It's really close,\" Thomas said when asked how close the margin is between where Dallas is and wants to be defensively. \"We fix some things up front and the back end as a team, and we're going to be a great team. And we are that great team right now, we just have to play like it, we have to execute like it.\"\n" +
                        "\n" +
                        "The main aspect that gives Thomas confidence despite the Cowboys sitting at last in the NFL in team defense is that what they see on tape that's wrong isn't broken beyond repair.\n" +
                        "\n" +
                        "\"Everything that happened on the field was correctable,\" Thomas said. \"Things that we can get better at, things that we can fix. No panic button, the connection of this team is the most important thing, so stay connected, stay believing, don't let anything fracture and just keep going from that.\"\n" +
                        "\n" +
                        "A big part of that comes with having something you can't teach: Effort. Thomas says that was one of the biggest things he took away from Week 4's game, despite the end result not being ideal.\n" +
                        "\n" +
                        "\"Osa played his tail off, Kenny Clark played his tail off, a lot of guys out there played their tail off. The effort was great, and the positive was that everyone fought. It wasn't the result we wanted, it wasn't exactly how we wanted to play, it wasn't our standard, but we fought to the end.\"\n" +
                        "\n" +
                        "\"A tie is frustrating. It feels like a loss, but it's not a loss. We know we can come out with that win, so we're staying positive, moving on and going to get better.\"\n" +
                        "\n" +
                        "Their next \"championship opportunity,\" as head coach Brian Schottenheimer calls each game, comes in the first of a two-game road stand for the Cowboys against the New York Jets.",
                modifier = Modifier.fillMaxWidth(0.95f).border(2.dp, Color.Black),
                textAlign = androidx.compose.ui.text.style.TextAlign.Justify,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }
    }
}

//NEW YORK
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun NewYorkGiantsView(){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar("New York Giants") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color(0xFF013369)
                )
            )
        }
    ){
        ContentNewYorkGiants()
    }
}

@Composable
fun ContentNewYorkGiants()
{
    LazyColumn(
        modifier = Modifier.fillMaxSize().background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        item {
            Space(espacio = 100)
            Image(
                painter = painterResource(id = R.drawable.news_giants),
                modifier = Modifier.fillMaxWidth(0.90f),
                contentDescription = "Logo"
            )
            Space(espacio = 20)
        }
        item{
            Text(
                text="Jaxson Dart said he wanted to do his best to be a spark in his first NFL start.\n" +
                        "\n" +
                        "The quarterback did just that and helped lead the New York Giants to their first win of the season against the previously undefeated Los Angeles Chargers. For his performance, the 25th overall pick has been nominated for Pepsi Zero Sugar Rookie of the Week.\n" +
                        "\n" +
                        "This is the third consecutive week a Giants rookie has been nominated for the honor. Cam Skattebo, a fourth-round draft choice who is now fifth among all NFL rookies in yards from scrimmage, was up for it in Weeks 2 and 3.\n" +
                        "\n" +
                        "Dart completed 13 of 20 passes for 111 pass yards on Sunday at MetLife Stadium, including a three-yard shovel pass to tight end Theo Johnson for his first career passing touchdown. He opened the game with a 15-yard rushing touchdown as part of 10 carries for 54 yards. The Giants never trailed after that.\n" +
                        "\n" +
                        "\"Obviously, this experience was a special one, it being my first one,\" Dart said in his postgame press conference. \"I'm just grateful to have the guys around me that I had. I obviously want to give a big shoutout to [Russell Wilson]. I know that this week probably wasn't the easiest thing, but he handled it like a professional and just was a mentor for me. I just have a ton of respect for him. It goes for Jameis [Winston] as well, just getting me prepared for this week. Really just proud of the guys, being able to battle through some adversity throughout the game. It's not always going to be the cleanest, but I was just happy that we were able to come out with the win.\"",
                modifier = Modifier.fillMaxWidth(0.95f).border(2.dp, Color.Black),
                textAlign = androidx.compose.ui.text.style.TextAlign.Justify,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }
    }
}

//GREEN BAY PACKERS
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun GreenBayPackersView(){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar("Green Bay Packers") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color(0xFF013369)
                )
            )
        }
    ){
        ContentGreenBayPackers()
    }
}

@Composable
fun ContentGreenBayPackers()
{
    LazyColumn(
        modifier = Modifier.fillMaxSize().background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        item {
            Space(espacio = 100)
            Image(
                painter = painterResource(id = R.drawable.news_gbp),
                modifier = Modifier.fillMaxWidth(0.90f),
                contentDescription = "Logo"
            )
            Space(espacio = 20)
        }
        item{
            Text(
                text= "GREEN BAY – The defensive breakdowns in Dallas became a \"snowball effect\" from Head Coach Matt LaFleur's perspective.\n" +
                        "\n" +
                        "Recapping on Tuesday the 40-40 overtime tie with the Cowboys, LaFleur felt the way the first half ended just gave Dallas too much momentum offensively, and the Packers couldn't stem the tide.\n" +
                        "\n" +
                        "It started with the Cowboys going 95 yards in 11 plays for a touchdown after punting on their first three drives. That pulled Dallas within 13-9 with 41 seconds left in the half.\n" +
                        "\n" +
                        "On the ensuing possession, the Packers stayed aggressive, which LaFleur admitted came from knowing the Cowboys were getting the ball to start the second half. It turned into adding more fuel to Dallas' fire.\n" +
                        "\n" +
                        "After getting a first down at their own 32-yard line, the Packers were called for a false start, backing up to the 27. With 21 seconds on the clock and no timeouts, LaFleur said he \"at that point should have just shut it down, and I didn't.\"\n" +
                        "\n" +
                        "The subsequent strip sack led to another Dallas TD before intermission, and Green Bay's defense – which had allowed just 44 points in three games before the Cowboys scored 40 – was on its heels the rest of the night.\n" +
                        "\n" +
                        "\"I thought it was like a snowball effect,\" LaFleur said of the carryover from the first half to the second. \"We never recovered from that point forward.\"\n" +
                        "\n" +
                        "It wasn't just one thing, either. LaFleur explained on a couple of third downs after halftime, the defensive call was man coverage, but it was played too soft, allowing \"easy completions.\""+
                        "In other instances, missed tackles kept the Cowboys in favorable down-and-distance situations.\n" +
                        "\n" +
                        "\"We could have really (taken) advantage, … instead they're breaking a tackle and either making a third-and-short or getting a first down,\" he said. \"So all in all it got real sloppy in the second half.\"\n" +
                        "\n" +
                        "It also didn't help that turnovers have been so hard to come by. Despite a huge emphasis in training camp on getting the ball out and taking it away, the results haven't been there.\n" +
                        "\n" +
                        "The Packers got a critical interception in the red zone against Detroit in Week 1, but since then the defense has just one takeaway, and that came on a desperation, fourth-down heave at the end of the first half in Cleveland that was picked off. The defense has yet to force a single fumble in four games.\n" +
                        "\n" +
                        "\"There's been a couple more out there for us that we haven't quite capitalized on,\" LaFleur said of turnover opportunities. \"It just hasn't rolled our way up to this point.\"\n" +
                        "\n" +
                        "Perhaps the first game after the bye week will change things. Backup Bengals quarterback Jake Browning has thrown five interceptions in 2½ games, and Cincinnati also has lost three fumbles.\n" +
                        "\n" +
                        "\"We're going to continue to emphasize it and continue to work on it,\" LaFleur said. \"I do think it's a matter of time before we get a couple to go our way.\"",
                modifier = Modifier.fillMaxWidth(0.95f).border(2.dp, Color.Black),
                textAlign = androidx.compose.ui.text.style.TextAlign.Justify,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }
    }
}