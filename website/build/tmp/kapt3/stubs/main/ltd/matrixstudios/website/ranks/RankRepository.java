package ltd.matrixstudios.website.ranks;

/**
 * Class created on 11/24/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@org.springframework.stereotype.Repository()
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lltd/matrixstudios/website/ranks/RankRepository;", "Lorg/springframework/data/mongodb/repository/MongoRepository;", "Lnet/minebo/basalt/models/ranks/Rank;", "", "findAll", "", "website"})
public abstract interface RankRepository extends org.springframework.data.mongodb.repository.MongoRepository<net.minebo.basalt.models.ranks.Rank, java.lang.String> {
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<net.minebo.basalt.models.ranks.Rank> findAll();
}