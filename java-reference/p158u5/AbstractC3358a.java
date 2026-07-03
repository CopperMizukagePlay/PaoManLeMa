package p158u5;

import java.io.Serializable;
import p001a0.AbstractC0094y0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u5.a */
/* loaded from: classes.dex */
public abstract class AbstractC3358a implements InterfaceC3364g, Serializable {

    /* renamed from: e */
    public final Object f16423e;

    /* renamed from: f */
    public final Class f16424f;

    /* renamed from: g */
    public final String f16425g;

    /* renamed from: h */
    public final String f16426h;

    /* renamed from: j */
    public final int f16428j;

    /* renamed from: i */
    public final boolean f16427i = false;

    /* renamed from: k */
    public final int f16429k = 4;

    public AbstractC3358a(int i7, Class cls, Object obj, String str, String str2) {
        this.f16423e = obj;
        this.f16424f = cls;
        this.f16425g = str;
        this.f16426h = str2;
        this.f16428j = i7;
    }

    @Override // p158u5.InterfaceC3364g
    /* renamed from: b */
    public final int mo4120b() {
        return this.f16428j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AbstractC3358a) {
                AbstractC3358a abstractC3358a = (AbstractC3358a) obj;
                if (this.f16427i == abstractC3358a.f16427i && this.f16428j == abstractC3358a.f16428j && this.f16429k == abstractC3358a.f16429k && this.f16423e.equals(abstractC3358a.f16423e) && this.f16424f.equals(abstractC3358a.f16424f) && this.f16425g.equals(abstractC3358a.f16425g) && this.f16426h.equals(abstractC3358a.f16426h)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i7;
        int m175b = AbstractC0094y0.m175b(AbstractC0094y0.m175b((this.f16424f.hashCode() + (this.f16423e.hashCode() * 31)) * 31, 31, this.f16425g), 31, this.f16426h);
        if (this.f16427i) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return ((((m175b + i7) * 31) + this.f16428j) * 31) + this.f16429k;
    }

    public final String toString() {
        AbstractC3380w.f16452a.getClass();
        return C3381x.m5109a(this);
    }
}
