package p105n5;

import java.io.Serializable;
import p001a0.AbstractC0094y0;
import p060h5.AbstractC1797e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n5.b */
/* loaded from: classes.dex */
public final class C2719b extends AbstractC1797e implements InterfaceC2718a, Serializable {

    /* renamed from: e */
    public final Enum[] f14566e;

    public C2719b(Enum[] enumArr) {
        this.f14566e = enumArr;
    }

    @Override // p060h5.AbstractC1792a
    /* renamed from: a */
    public final int mo299a() {
        return this.f14566e.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018 A[RETURN] */
    @Override // p060h5.AbstractC1792a, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(Object obj) {
        Enum r02;
        if (obj instanceof Enum) {
            Enum r42 = (Enum) obj;
            int ordinal = r42.ordinal();
            if (ordinal >= 0) {
                Enum[] enumArr = this.f14566e;
                if (ordinal < enumArr.length) {
                    r02 = enumArr[ordinal];
                    if (r02 != r42) {
                        return true;
                    }
                    return false;
                }
            }
            r02 = null;
            if (r02 != r42) {
            }
        } else {
            return false;
        }
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Enum[] enumArr = this.f14566e;
        int length = enumArr.length;
        if (i7 >= 0 && i7 < length) {
            return enumArr[i7];
        }
        throw new IndexOutOfBoundsException(AbstractC0094y0.m182i(i7, length, "index: ", ", size: "));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018 A[RETURN] */
    @Override // p060h5.AbstractC1797e, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int indexOf(Object obj) {
        Enum r12;
        if (obj instanceof Enum) {
            Enum r42 = (Enum) obj;
            int ordinal = r42.ordinal();
            if (ordinal >= 0) {
                Enum[] enumArr = this.f14566e;
                if (ordinal < enumArr.length) {
                    r12 = enumArr[ordinal];
                    if (r12 != r42) {
                        return ordinal;
                    }
                    return -1;
                }
            }
            r12 = null;
            if (r12 != r42) {
            }
        } else {
            return -1;
        }
    }

    @Override // p060h5.AbstractC1797e, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return indexOf((Enum) obj);
    }
}
