import mongoose from "mongoose";
try {
  const db = await mongoose.connect(
    "mongodb+srv://SameerKumar:sameerkumar123@cluster-vod.nsgw4.mongodb.net/UCA"
  );
  console.log("db is Connected");
} catch (e) {
  console.log(e.message);
}
