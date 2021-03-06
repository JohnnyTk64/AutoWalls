/*
 * AutoWalls by jkush321 is licensed under the
 * Creative Commons Attribution-NonCommercial 3.0 Unported License
 * 
 * You are fully allowed to modify the source code for your own network
 * of servers, but you may not distribute the modified code outside of
 * your servers.
 * 
 * AutoWalls was originally a personal project that was standalone for
 * my own private server, and it slowly accumulated into a giant plugin.
 * 
 * AutoWalls is for dedicated servers that are willing to run just Walls.
 * 
 * The license requires attribution and you have to give credit to jkush321
 * no matter how many changes were made to the code. In some clearly stated
 * way everyone who goes on the server must be able to easily see and be aware
 * of the fact that this code originated from jkush321 and was modified by
 * you or your team.
 * 
 * For more information visit http://bit.ly/AutoWalls
 * 
 */

package com.jkush321.autowalls.kits;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

import com.jkush321.autowalls.ItemUtils;


public class KitPyro2 extends Kit {

	ItemStack[] contents;
	
	public KitPyro2()
	{
		ItemStack chest = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
		ItemStack legs = new ItemStack(Material.CHAINMAIL_LEGGINGS);
		ItemStack helm = new ItemStack(Material.IRON_HELMET);
		ItemStack fireCharges = new ItemStack(Material.FIREBALL, 64);
		ItemStack lavaBucket = new ItemStack(Material.LAVA_BUCKET, 3);
		chest.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 5);
		ItemStack fireSword = new ItemStack(Material.DIAMOND_SWORD, 1);
		fireSword.addEnchantment(Enchantment.FIRE_ASPECT, 2);
		fireSword = ItemUtils.setItemName(fireSword, ChatColor.YELLOW + "Ignition Blade II");

		contents = new ItemStack[]{ fireSword, helm, chest, legs, fireCharges, lavaBucket };
	}
	
	@Override
	public ItemStack[] getItemStack() {
		return contents;
	}

	@Override
	public int getRequiredPriority() {
		return 300;
	}

}
