package p059h3;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import p029d3.AbstractC0496c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h3.d */
/* loaded from: classes.dex */
public final class C1778d {

    /* renamed from: c */
    public static final C1778d f10814c;

    /* renamed from: d */
    public static final C1778d f10815d;

    /* renamed from: e */
    public static final C1778d f10816e;

    /* renamed from: f */
    public static final C1778d f10817f;

    /* renamed from: g */
    public static final C1778d f10818g;

    /* renamed from: h */
    public static final C1778d f10819h;

    /* renamed from: i */
    public static final C1778d f10820i;

    /* renamed from: j */
    public static final C1778d f10821j;

    /* renamed from: a */
    public final Object f10822a;

    /* renamed from: b */
    public final int f10823b;

    /* JADX WARN: Code restructure failed: missing block: B:48:0x020b, code lost:
    
        if (r4 >= 3600001) goto L67;
     */
    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        int i7;
        boolean z7 = true;
        new C1778d(null, 1, null, null);
        new C1778d(null, 2, null, null);
        new C1778d(null, 4, null, null);
        new C1778d(null, 8, null, null);
        new C1778d(null, 16, null, null);
        new C1778d(null, 32, null, null);
        f10814c = new C1778d(null, 64, null, null);
        f10815d = new C1778d(null, 128, null, null);
        new C1778d(null, 256, null, AbstractC1785k.class);
        new C1778d(null, 512, null, AbstractC1785k.class);
        new C1778d(null, 1024, null, AbstractC1786l.class);
        new C1778d(null, 2048, null, AbstractC1786l.class);
        f10816e = new C1778d(null, 4096, null, null);
        f10817f = new C1778d(null, 8192, null, null);
        new C1778d(null, 16384, null, null);
        new C1778d(null, 32768, null, null);
        new C1778d(null, 65536, null, null);
        new C1778d(null, 131072, null, AbstractC1790p.class);
        new C1778d(null, 262144, null, null);
        new C1778d(null, 524288, null, null);
        new C1778d(null, 1048576, null, null);
        new C1778d(null, 2097152, null, AbstractC1791q.class);
        new C1778d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null);
        new C1778d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, AbstractC1788n.class);
        f10818g = new C1778d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null);
        f10819h = new C1778d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null);
        f10820i = new C1778d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null);
        f10821j = new C1778d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        } else {
            accessibilityAction = null;
        }
        new C1778d(accessibilityAction, R.id.accessibilityActionPageUp, null, null);
        if (i8 >= 29) {
            accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
        } else {
            accessibilityAction2 = null;
        }
        new C1778d(accessibilityAction2, R.id.accessibilityActionPageDown, null, null);
        if (i8 >= 29) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction3 = null;
        }
        new C1778d(accessibilityAction3, R.id.accessibilityActionPageLeft, null, null);
        if (i8 >= 29) {
            accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
        } else {
            accessibilityAction4 = null;
        }
        new C1778d(accessibilityAction4, R.id.accessibilityActionPageRight, null, null);
        new C1778d(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null);
        new C1778d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, AbstractC1789o.class);
        if (i8 >= 26) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction5 = null;
        }
        new C1778d(accessibilityAction5, R.id.accessibilityActionMoveWindow, null, AbstractC1787m.class);
        if (i8 >= 28) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
        } else {
            accessibilityAction6 = null;
        }
        new C1778d(accessibilityAction6, R.id.accessibilityActionShowTooltip, null, null);
        if (i8 >= 28) {
            accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
        } else {
            accessibilityAction7 = null;
        }
        new C1778d(accessibilityAction7, R.id.accessibilityActionHideTooltip, null, null);
        if (i8 >= 30) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction8 = null;
        }
        new C1778d(accessibilityAction8, R.id.accessibilityActionPressAndHold, null, null);
        if (i8 >= 30) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
        } else {
            accessibilityAction9 = null;
        }
        new C1778d(accessibilityAction9, R.id.accessibilityActionImeEnter, null, null);
        if (i8 >= 32) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction10 = null;
        }
        new C1778d(accessibilityAction10, R.id.ALT, null, null);
        if (i8 >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
        } else {
            accessibilityAction11 = null;
        }
        new C1778d(accessibilityAction11, R.id.CTRL, null, null);
        if (i8 >= 32) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
        } else {
            accessibilityAction12 = null;
        }
        new C1778d(accessibilityAction12, R.id.FUNCTION, null, null);
        if (i8 >= 33) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
        } else {
            accessibilityAction13 = null;
        }
        new C1778d(accessibilityAction13, R.id.KEYCODE_0, null, null);
        if (i8 >= 34) {
            accessibilityAction14 = AbstractC1776b.m2939a();
        } else {
            accessibilityAction14 = null;
        }
        new C1778d(accessibilityAction14, R.id.KEYCODE_3D_MODE, null, null);
        int i9 = AbstractC0496c.f1778a;
        if (i8 >= 36) {
            if (i8 >= 36) {
                i7 = Build.VERSION.SDK_INT_FULL;
            } else {
                i7 = i8 * 100000;
            }
        }
        z7 = false;
        if (z7) {
            accessibilityAction15 = AbstractC1780f.m2953a();
        } else {
            accessibilityAction15 = null;
        }
        new C1778d(accessibilityAction15, R.id.KEYCODE_4, null, null);
    }

    public C1778d(String str, int i7) {
        this(null, i7, str, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1778d)) {
            return false;
        }
        Object obj2 = ((C1778d) obj).f10822a;
        Object obj3 = this.f10822a;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        }
        if (!obj3.equals(obj2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f10822a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String m2954c = C1782h.m2954c(this.f10823b);
        if (m2954c.equals("ACTION_UNKNOWN")) {
            Object obj = this.f10822a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                m2954c = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(m2954c);
        return sb.toString();
    }

    public C1778d(Object obj, int i7, CharSequence charSequence, Class cls) {
        this.f10823b = i7;
        if (obj == null) {
            this.f10822a = new AccessibilityNodeInfo.AccessibilityAction(i7, charSequence);
        } else {
            this.f10822a = obj;
        }
    }
}
