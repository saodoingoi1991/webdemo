package shorten;

public class UrlMapping {
    public static final String CONTRACT_MANAGER = "quan-ly-hop-dong";
    public static IUrlStoreService urlStoreService = new InMemoryUrlStoreService();

    public static final void addUrl() {
        urlStoreService.storeUrl(CONTRACT_MANAGER, "admin/qlhopdong");
    }
}
