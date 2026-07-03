package p163v2;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import p001a0.C0031h1;
import p085l0.C2387n;
import p109o1.C2799d;
import p150t5.InterfaceC3279c;
import p153u0.InterfaceC3337d;
import p153u0.InterfaceC3338e;
import p162v1.InterfaceC3524n1;
import p170w1.AbstractC3652a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v2.p */
/* loaded from: classes.dex */
public final class C3576p extends AbstractC3569i {

    /* renamed from: D */
    public final View f17180D;

    /* renamed from: E */
    public final C2799d f17181E;

    /* renamed from: F */
    public InterfaceC3337d f17182F;

    /* renamed from: G */
    public InterfaceC3279c f17183G;

    /* renamed from: H */
    public InterfaceC3279c f17184H;

    /* renamed from: I */
    public InterfaceC3279c f17185I;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3576p(Context context, InterfaceC3279c interfaceC3279c, C2387n c2387n, InterfaceC3338e interfaceC3338e, int i7, InterfaceC3524n1 interfaceC3524n1) {
        super(context, c2387n, i7, r4, r5, interfaceC3524n1);
        Object obj;
        View view = (View) interfaceC3279c.mo23f(context);
        C2799d c2799d = new C2799d();
        this.f17180D = view;
        this.f17181E = c2799d;
        setClipChildren(false);
        String valueOf = String.valueOf(i7);
        if (interfaceC3338e != null) {
            obj = interfaceC3338e.mo5076e(valueOf);
        } else {
            obj = null;
        }
        SparseArray<Parcelable> sparseArray = obj instanceof SparseArray ? (SparseArray) obj : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (interfaceC3338e != null) {
            setSavableRegistryEntry(interfaceC3338e.mo5077f(valueOf, new C3568h(this, 2)));
        }
        C3563c c3563c = C3563c.f17117j;
        this.f17183G = c3563c;
        this.f17184H = c3563c;
        this.f17185I = c3563c;
    }

    /* renamed from: h */
    public static final void m5546h(C3576p c3576p) {
        c3576p.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(InterfaceC3337d interfaceC3337d) {
        InterfaceC3337d interfaceC3337d2 = this.f17182F;
        if (interfaceC3337d2 != null) {
            ((C0031h1) interfaceC3337d2).m87K();
        }
        this.f17182F = interfaceC3337d;
    }

    public final C2799d getDispatcher() {
        return this.f17181E;
    }

    public final InterfaceC3279c getReleaseBlock() {
        return this.f17185I;
    }

    public final InterfaceC3279c getResetBlock() {
        return this.f17184H;
    }

    public /* bridge */ /* synthetic */ AbstractC3652a getSubCompositionView() {
        return null;
    }

    public final InterfaceC3279c getUpdateBlock() {
        return this.f17183G;
    }

    public final void setReleaseBlock(InterfaceC3279c interfaceC3279c) {
        this.f17185I = interfaceC3279c;
        setRelease(new C3568h(this, 3));
    }

    public final void setResetBlock(InterfaceC3279c interfaceC3279c) {
        this.f17184H = interfaceC3279c;
        setReset(new C3568h(this, 4));
    }

    public final void setUpdateBlock(InterfaceC3279c interfaceC3279c) {
        this.f17183G = interfaceC3279c;
        setUpdate(new C3568h(this, 5));
    }

    public View getViewRoot() {
        return this;
    }
}
