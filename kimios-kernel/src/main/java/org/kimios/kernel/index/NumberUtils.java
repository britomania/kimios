/*
 * Kimios - Document Management System Software
 * Copyright (C) 2012-2013  DevLib'
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.kimios.kernel.index;

import java.text.DecimalFormat;
import java.text.ParseException;

public class NumberUtils
{
    private static final DecimalFormat formatter =
            new DecimalFormat("00000000000000000000000000000000000");

    public static String pad(long n)
    {
        return formatter.format(n);
    }

    public static long unpad(String s) throws ParseException
    {
        return formatter.parse(s).longValue();
    }
}

