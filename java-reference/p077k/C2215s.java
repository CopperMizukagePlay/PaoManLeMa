package p077k;

import java.util.Map;
import p158u5.AbstractC3367j;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k.s */
/* loaded from: classes.dex */
public class C2215s implements Map.Entry, InterfaceC3594a {

    /* renamed from: e */
    public final /* synthetic */ int f12736e;

    /* renamed from: f */
    public final Object f12737f;

    /* renamed from: g */
    public final Object f12738g;

    public /* synthetic */ C2215s(int i7, Object obj, Object obj2) {
        this.f12736e = i7;
        this.f12737f = obj;
        this.f12738g = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        Map.Entry entry;
        switch (this.f12736e) {
            case 1:
                if (obj instanceof Map.Entry) {
                    entry = (Map.Entry) obj;
                } else {
                    entry = null;
                }
                if (entry != null && AbstractC3367j.m5096a(entry.getKey(), this.f12737f) && AbstractC3367j.m5096a(entry.getValue(), getValue())) {
                    return true;
                }
                return false;
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f12736e) {
            case 0:
                return this.f12737f;
            default:
                return this.f12737f;
        }
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.f12736e) {
            case 0:
                return this.f12738g;
            default:
                return this.f12738g;
        }
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        int i7;
        switch (this.f12736e) {
            case 1:
                int i8 = 0;
                Object obj = this.f12737f;
                if (obj != null) {
                    i7 = obj.hashCode();
                } else {
                    i7 = 0;
                }
                Object value = getValue();
                if (value != null) {
                    i8 = value.hashCode();
                }
                return i8 ^ i7;
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.f12736e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.f12736e) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append(this.f12737f);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
