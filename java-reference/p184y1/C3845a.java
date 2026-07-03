package p184y1;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import p001a0.C0022f0;
import p027d1.C0465c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: y1.a */
/* loaded from: classes.dex */
public final class C3845a extends ActionMode.Callback2 {

    /* renamed from: a */
    public final C3847c f18060a;

    public C3845a(C3847c c3847c) {
        this.f18060a = c3847c;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        C3847c c3847c = this.f18060a;
        c3847c.getClass();
        AbstractC3367j.m5097b(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            C0022f0 c0022f0 = c3847c.f18071c;
            if (c0022f0 != null) {
                c0022f0.mo52a();
            }
        } else if (itemId == 1) {
            C0022f0 c0022f02 = c3847c.f18072d;
            if (c0022f02 != null) {
                c0022f02.mo52a();
            }
        } else if (itemId == 2) {
            C0022f0 c0022f03 = c3847c.f18073e;
            if (c0022f03 != null) {
                c0022f03.mo52a();
            }
        } else if (itemId == 3) {
            C0022f0 c0022f04 = c3847c.f18074f;
            if (c0022f04 != null) {
                c0022f04.mo52a();
            }
        } else if (itemId != 4) {
            return false;
        }
        if (actionMode != null) {
            actionMode.finish();
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        C3847c c3847c = this.f18060a;
        c3847c.getClass();
        if (menu != null) {
            if (actionMode != null) {
                if (c3847c.f18071c != null) {
                    C3847c.m5865a(menu, EnumC3846b.f18061g);
                }
                if (c3847c.f18072d != null) {
                    C3847c.m5865a(menu, EnumC3846b.f18062h);
                }
                if (c3847c.f18073e != null) {
                    C3847c.m5865a(menu, EnumC3846b.f18063i);
                }
                if (c3847c.f18074f != null) {
                    C3847c.m5865a(menu, EnumC3846b.f18064j);
                    return true;
                }
                return true;
            }
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f18060a.f18069a.mo52a();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        C0465c c0465c = this.f18060a.f18070b;
        if (rect != null) {
            rect.set((int) c0465c.f1625a, (int) c0465c.f1626b, (int) c0465c.f1627c, (int) c0465c.f1628d);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        C3847c c3847c = this.f18060a;
        c3847c.getClass();
        if (actionMode != null && menu != null) {
            C3847c.m5866b(menu, EnumC3846b.f18061g, c3847c.f18071c);
            C3847c.m5866b(menu, EnumC3846b.f18062h, c3847c.f18072d);
            C3847c.m5866b(menu, EnumC3846b.f18063i, c3847c.f18073e);
            C3847c.m5866b(menu, EnumC3846b.f18064j, c3847c.f18074f);
            C3847c.m5866b(menu, EnumC3846b.f18065k, null);
            return true;
        }
        return false;
    }
}
