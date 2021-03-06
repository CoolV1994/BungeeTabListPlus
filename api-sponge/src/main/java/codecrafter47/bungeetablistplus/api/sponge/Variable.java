/*
 * BungeeTabListPlus - a BungeeCord plugin to customize the tablist
 *
 * Copyright (C) 2014 - 2015 Florian Stober
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package codecrafter47.bungeetablistplus.api.sponge;

import org.spongepowered.api.entity.living.player.Player;

/**
 * Base class for creating custom Variables.
 * <p>
 * To create a custom Variable you need to create a subclass of this class
 * and register an instance of it with {@link BungeeTabListPlusSpongeAPI#registerVariable}
 */
public abstract class Variable {
    private final String name;

    /**
     * invoked by the subclass to set the name of the variable
     *
     * @param name name of the variable without { }
     */
    public Variable(String name) {
        this.name = name;
    }

    /**
     * This method is periodically invoked by BungeeTabListPlus to check whether the replacement for the variable changed
     * <p>
     * This method will be invoked by threads other than the games main thread and may also be invoked concurrently.
     *
     * @param player the player for which the variable should be replaced
     * @return the replacement for the variable
     */
    public abstract String getReplacement(Player player);

    /**
     * getter for the variable name
     *
     * @return the name of the variable without { }
     */
    public final String getName() {
        return name;
    }
}
