package me.Wiedzmin137.wheroesaddon;

import me.Whatshiywl.heroesskilltree.HeroesSkillTree;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import com.herocraftonline.heroes.characters.Hero;

public class WEventListener implements Listener {
	@EventHandler
	public void onPlayerRegister(fr.xephi.authme.events.LoginEvent e) {
		//TODO test is that works (it should return one of sendMessage in game after /login Password)
		Player player = e.getPlayer();
		Hero hero = HeroesSkillTree.heroes.getCharacterManager().getHero(player);
		if (hero.getHeroClass().isDefault()) {
			ItemGUI.createClassChoose(e.getPlayer());
		}
	}
}