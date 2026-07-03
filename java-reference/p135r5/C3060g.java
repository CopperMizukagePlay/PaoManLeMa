package p135r5;

import java.io.File;
import java.util.ArrayDeque;
import p015b6.C0304k;
import p060h5.AbstractC1794b;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r5.g */
/* loaded from: classes.dex */
public final class C3060g extends AbstractC1794b {

    /* renamed from: g */
    public final ArrayDeque f15653g;

    /* renamed from: h */
    public final /* synthetic */ C0304k f15654h;

    public C3060g(C0304k c0304k) {
        this.f15654h = c0304k;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f15653g = arrayDeque;
        File file = (File) c0304k.f1097b;
        if (file.isDirectory()) {
            arrayDeque.push(m4734b(file));
        } else if (file.isFile()) {
            AbstractC3367j.m5100e(file, "rootFile");
            arrayDeque.push(new AbstractC3061h(file));
        } else {
            this.f10847e = 2;
        }
    }

    @Override // p060h5.AbstractC1794b
    /* renamed from: a */
    public final void mo655a() {
        File file;
        File mo4733a;
        while (true) {
            ArrayDeque arrayDeque = this.f15653g;
            AbstractC3061h abstractC3061h = (AbstractC3061h) arrayDeque.peek();
            if (abstractC3061h == null) {
                file = null;
                break;
            }
            mo4733a = abstractC3061h.mo4733a();
            if (mo4733a == null) {
                arrayDeque.pop();
            } else if (mo4733a.equals(abstractC3061h.f15655a) || !mo4733a.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                break;
            } else {
                arrayDeque.push(m4734b(mo4733a));
            }
        }
        file = mo4733a;
        if (file != null) {
            this.f10848f = file;
            this.f10847e = 1;
        } else {
            this.f10847e = 2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [r5.h, r5.c] */
    /* JADX WARN: Type inference failed for: r0v5, types: [r5.h, r5.c] */
    /* renamed from: b */
    public final AbstractC3056c m4734b(File file) {
        int ordinal = ((EnumC3062i) this.f15654h.f1098c).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                AbstractC3367j.m5100e(file, "rootDir");
                return new AbstractC3061h(file);
            }
            throw new RuntimeException();
        }
        AbstractC3367j.m5100e(file, "rootDir");
        return new AbstractC3061h(file);
    }
}
