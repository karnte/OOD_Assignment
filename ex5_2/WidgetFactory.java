public class WidgetFactory {
    public static enum WidgetFactoryType {
        PM,
        MOTIF
    }

    public static IWidgetFactory getWidgetFactory(WidgetFactoryType type) {
        IWidgetFactory widget = null;
        switch (type) {
            case WidgetFactoryType.PM:
                widget = PMWidgetFactory.getMotifWidgetFactory();
                break;
            case WidgetFactoryType.MOTIF:
                widget = MotifWidgetFactory.getMotifWidgetFactory();
                break;
        }
        return widget;
    }
}