package com.sk89q.minecraft.util.pagination;

import com.sk89q.minecraft.util.commands.ChatColor;


public abstract class SimplePaginatedResult<T> extends PaginatedResult<T> {
    protected final String header;

    public SimplePaginatedResult(String header) {
        super();
        this.header = header;
    }

    public SimplePaginatedResult(String header, int resultsPerPage) {
        super(resultsPerPage);
        this.header = header;
    }

    @Override
    public String formatHeader(int page, int maxPages) {
        return ChatColor.AQUA + this.header + ChatColor.GRAY + " (" + ChatColor.DARK_AQUA + "page" + ChatColor.AQUA.toString()  + page + ChatColor.DARK_RED +  "/" + ChatColor.GREEN.toString() + maxPages + ChatColor.GRAY + ")";
    }
}
