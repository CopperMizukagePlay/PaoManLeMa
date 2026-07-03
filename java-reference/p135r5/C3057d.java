package p135r5;

import java.io.File;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r5.d */
/* loaded from: classes.dex */
public final class C3057d extends AbstractC3056c {

    /* renamed from: b */
    public boolean f15645b;

    /* renamed from: c */
    public File[] f15646c;

    /* renamed from: d */
    public int f15647d;

    /* renamed from: e */
    public boolean f15648e;

    @Override // p135r5.AbstractC3061h
    /* renamed from: a */
    public final File mo4733a() {
        boolean z7 = this.f15648e;
        File file = this.f15655a;
        if (!z7 && this.f15646c == null) {
            File[] listFiles = file.listFiles();
            this.f15646c = listFiles;
            if (listFiles == null) {
                this.f15648e = true;
            }
        }
        File[] fileArr = this.f15646c;
        if (fileArr != null && this.f15647d < fileArr.length) {
            AbstractC3367j.m5097b(fileArr);
            int i7 = this.f15647d;
            this.f15647d = i7 + 1;
            return fileArr[i7];
        }
        if (!this.f15645b) {
            this.f15645b = true;
            return file;
        }
        return null;
    }
}
