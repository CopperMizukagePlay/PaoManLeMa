package p051g3;

import android.os.Build;
import android.view.DisplayCutout;
import java.util.Objects;
import p012b3.C0274b;
import p029d3.AbstractC0495b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.c */
/* loaded from: classes.dex */
public final class C1624c {

    /* renamed from: a */
    public final DisplayCutout f10367a;

    public C1624c(DisplayCutout displayCutout) {
        this.f10367a = displayCutout;
    }

    /* renamed from: a */
    public final C0274b m2638a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return C0274b.m582c(AbstractC0495b.m1073c(this.f10367a));
        }
        return C0274b.f1014e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1624c.class == obj.getClass()) {
            return Objects.equals(this.f10367a, ((C1624c) obj).f10367a);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f10367a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f10367a + "}";
    }
}
