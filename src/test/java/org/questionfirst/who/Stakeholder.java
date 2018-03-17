/*
 * dataSet - Test Support For Data Stores.
 *
 * Copyright (C) 2014-2018 'Marko Umek' (http://fail-early.com/contact)
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
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package org.questionfirst.who;

/**
 * Stakeholder is responsible for ...
 */
public interface Stakeholder {
    default String bio() { return "No bio yet";}
    
    default Intentions[] intentions() { return new Intentions[]{new None()}; }

    interface Intentions {
        default String description() { return "No description yet";}
    }

    class None implements Intentions {
    }
}
