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
package org.kimios.kernel.exception;

@SuppressWarnings("serial")
public class MetaFeedSearchException extends DmsKernelException
{
    public MetaFeedSearchException()
    {
        super();
    }

    public MetaFeedSearchException(Exception e, String message)
    {
        super(e, message);
    }

    public MetaFeedSearchException(Exception e)
    {
        super(e);
    }

    public MetaFeedSearchException(String message)
    {
        super(message);
    }

    public String toString()
    {
        return "An meta feed search error has occured";
    }
}

